/*
UserCreateのユースケースで利用するInputData.
 */
package architecture.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateInputData {

    /** ユーザー名. */
    private String userName;
}
