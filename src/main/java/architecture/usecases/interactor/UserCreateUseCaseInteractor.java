/*
ユーザー作成のユースケースの実装クラス.
 */
package architecture.usecases.interactor;

import architecture.domain.dtos.UserCreateInputData;
import architecture.domain.dtos.UserCreateOutputData;
import architecture.domain.entities.UserEntity;
import architecture.interfaces.gateways.UserRepository;
import architecture.interfaces.presenters.UserCreatePresenter;
import architecture.usecases.UserCreateUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class UserCreateUseCaseInteractor implements UserCreateUseCase {

    // インターフェスで受け取っているので依存していない
    @Autowired
    private UserRepository repository;

    // インターフェスで受け取っているので依存していない
    @Autowired
    private UserCreatePresenter presenter;

    @Override
    public UserCreateOutputData create(UserCreateInputData inputData) throws Exception {
        // ロジックを実装
        List<UserEntity> userEntityList = repository.findByUserName(inputData.getUserName());
        if (!StringUtils.isEmpty(userEntityList)) {
            throw new Exception("そのユーザーは既に存在します。");
        }

        UserEntity entity = new UserEntity();
        entity.setUserName(inputData.getUserName());
        entity.setCreatedAt(new Date());

        Integer userId = repository.save(entity);

        UserCreateOutputData outputData = presenter.convertCreatedAt(userId, new Date());
        return outputData;
    }
}
