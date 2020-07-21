package com.redditClone.repository;

import com.redditClone.model.VerificationToken;
import org.hibernate.type.descriptor.sql.LongVarcharTypeDescriptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {
}
