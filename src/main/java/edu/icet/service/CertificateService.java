package edu.icet.service;

import edu.icet.dto.CertificateDTO;
import org.springframework.security.core.Authentication;

public interface CertificateService {
    CertificateDTO getById(Authentication authentication, Long id);

    String checkValid(Long id);
}
