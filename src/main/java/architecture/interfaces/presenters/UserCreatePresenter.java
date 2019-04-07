/*
UserCreateのユースケースが出力するデータをViewのためのViewModelへの変換を行うインターフェス.
 */
package architecture.interfaces.presenters;

import architecture.domain.dtos.UserCreateOutputData;

import java.util.Date;

public interface UserCreatePresenter {
    /**
     * 出力データの作成日時をフォーマットする.
     * @param userId: ユーザーID
     * @param createdAt: ユーザー作成日時
     * @return UserCreateOutputData
     */
    UserCreateOutputData convertCreatedAt(Integer userId, Date createdAt);
}
