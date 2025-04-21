package edu.icet.service.impl;

import edu.icet.dto.EnrollmentDTO;
import edu.icet.service.EnrollmentService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    @Override
    public EnrollmentDTO create(Authentication authentication, EnrollmentDTO enrollmentDTO) {
        return null;
    }

    @Override
    public EnrollmentDTO getById(Authentication authentication, Long id) {
        return null;
    }

    @Override
    public List<EnrollmentDTO> getAll(Authentication authentication) {
        return List.of();
    }

    @Override
    public EnrollmentDTO update(Authentication authentication, EnrollmentDTO enrollmentDTO) {
        return null;
    }

    @Override
    public void delete(Authentication authentication, Long id) {

    }

    @Override
    public List<EnrollmentDTO> findByStudentId(Authentication authentication, Long studentId) {
        return List.of();
    }

    @Override
    public List<EnrollmentDTO> findByCourseId(Authentication authentication, Long courseId) {
        return List.of();
    }
}
