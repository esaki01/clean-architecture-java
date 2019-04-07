/*
UserCreateのユースケースが出力するデータをViewのためのViewModelへの変換を行う実装クラス.
 */
package architecture.interfaces.presenters.impl;

import architecture.domain.dtos.UserCreateOutputData;
import architecture.interfaces.presenters.UserCreatePresenter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserCreatePresenterImpl implements UserCreatePresenter {

    @Override
    public UserCreateOutputData convertCreatedAt(Integer userId, Date createdAt) {
        // ユーザー作成日時をフォーマットする処理を実装する
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String createdDate = dateFormat.format(createdAt);

        UserCreateOutputData outputData = new UserCreateOutputData();
        outputData.setUserId(userId.toString());
        outputData.setCreatedAt(createdDate);

        return outputData;
    }
}
