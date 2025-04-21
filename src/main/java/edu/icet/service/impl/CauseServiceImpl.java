package edu.icet.service.impl;

import edu.icet.dto.CauseDTO;
import edu.icet.service.CauseService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CauseServiceImpl implements CauseService {
    @Override
    public List<CauseDTO> getCauses(Authentication authentication, Integer count) {
        return List.of();
    }

    @Override
    public CauseDTO createCause(Authentication authentication, CauseDTO causeDTO) {
        return null;
    }

    @Override
    public CauseDTO update(Authentication authentication, CauseDTO causeDTO) {
        return null;
    }

    @Override
    public Boolean hardDelete(Authentication authentication, Long id) {
        return null;
    }

    @Override
    public Boolean softDelete(Authentication authentication, Long id) {
        return null;
    }
}
