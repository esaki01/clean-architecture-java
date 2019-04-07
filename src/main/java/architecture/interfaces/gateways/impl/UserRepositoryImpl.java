/*
 * UserRepositoryの実装クラス.
 */
package architecture.interfaces.gateways.impl;

import architecture.domain.entities.UserEntity;
import architecture.interfaces.gateways.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<UserEntity> findByUserName(String userName) {
        // データベースにアクセスしてIDでユーザーを検索するように実装する
        return null;
    }

    @Override
    public Integer save(UserEntity userEntity) {
        // データベースにユーザーを登録するように実装する
        return null;
    }
}
