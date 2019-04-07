/*
ユーザー作成のユースケースのインターフェス.
 */
package architecture.usecases;

import architecture.domainddd.dtos.UserCreateInputData;
import architecture.domainddd.dtos.UserCreateOutputData;
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
