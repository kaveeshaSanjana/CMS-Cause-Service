package edu.icet.entity;

import edu.icet.enums.CauseVisibility;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "video")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoId;
    private Long causeId;
    private String url;
    private String title;
    private String description;
    private Short position;
    private Boolean isEnable;
    private CauseVisibility causeVisibility;
}
