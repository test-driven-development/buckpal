package io.reflectoring.buckpal.account.adapter.out.persistence;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "activity")
@Data
@AllArgsConstructor
@NoArgsConstructor
class ActivityJpaEntity {

  @Id
  @GeneratedValue
  private Long id;

  @Column
  private LocalDateTime timestamp;

  @Column
  private Long ownerAccountId;

  @Column
  private Long sourceAccountId;

  @Column
  private Long targetAccountId;

  @Column
  private Long amount;
}
