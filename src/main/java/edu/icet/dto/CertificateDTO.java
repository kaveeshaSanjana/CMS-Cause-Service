package edu.icet.dto;

import edu.icet.entity.EnrollCausesEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificateDTO {
    private Long certificateId;
    private String url;
    private LocalDate earnDate;
    private Long enrollId;
}
