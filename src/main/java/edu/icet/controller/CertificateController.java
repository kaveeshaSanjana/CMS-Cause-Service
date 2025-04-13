package edu.icet.controller;

import edu.icet.dto.CertificateDTO;
import edu.icet.service.CertificateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/certificate")
@CrossOrigin
@RequiredArgsConstructor
public class CertificateController {
    private CertificateService certificateService;

    @GetMapping("/check/{id}")
    public ResponseEntity<String> checkValid(@PathVariable("id")Long id){
        return ResponseEntity.ok().body(certificateService.checkValid(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CertificateDTO> getById(Authentication authentication,@PathVariable("id")Long id){
        return ResponseEntity.ok().body(certificateService.getById(authentication,id));
    }


}
