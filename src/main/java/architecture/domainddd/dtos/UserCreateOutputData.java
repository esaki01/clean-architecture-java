/*
UserCreateのユースケースで利用するOutputData.
表示のために出力の形を変えたい（例えばユーザー作成日時をフォーマットしたい）場合の処理は、architecture.interfaces.presentersが担当する.
 */
package architecture.domainddd.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateOutputData {

    /** ユーザーID. */
    private String userId;

    /** ユーザー作成日時 */
    private String createdAt;
}
