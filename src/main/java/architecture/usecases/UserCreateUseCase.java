/*
ユーザー作成のユースケースのインターフェス.
 */
package architecture.usecases;

import architecture.domain.dtos.UserCreateInputData;
import architecture.domain.dtos.UserCreateOutputData;
import org.springframework.stereotype.Service;

@Service
public interface UserCreateUseCase {
    /**
     * ユーザーを作成する.
     * @param inputData: 入力データ
     * @return UserCreateOutputDatas
     */
    UserCreateOutputData create(UserCreateInputData inputData) throws Exception;
}
