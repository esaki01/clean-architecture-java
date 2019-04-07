/*
UserEntityクラス.
 */
package architecture.domains.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User")
public class UserEntity {

    /** ユーザーID. */
    @Id
    @GeneratedValue
    private Integer userId;

    /** ユーザー名. */
    private String userName;

    /** ユーザー作成日時 */
    private Date createdAt;
}
