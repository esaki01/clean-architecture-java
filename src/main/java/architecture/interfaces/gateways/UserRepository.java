/*
UserRepositoryのインターフェス.
 */
package architecture.interfaces.gateways;

import architecture.domain.entities.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    /**
     * ユーザー名で検索する.
     * @param userName: ユーザー名
     * @return UserEntityのList
     */
    List<UserEntity> findByUserName(String userName);

    /**
     * ユーザーを登録する.
     * @param userEntity: ユーザーエンティティ
     * @return ユーザーID
     */
    Integer save(UserEntity userEntity);
}
