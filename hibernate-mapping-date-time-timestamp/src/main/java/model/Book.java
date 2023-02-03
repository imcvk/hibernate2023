package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column
  private String title;

  @Column
  private String content;

  @Column
  private LocalDate lastUpdateDate;

  @Column
  private LocalTime lastUpdateTime;

  @Column
  private LocalDateTime publishedTimestamp;
}
