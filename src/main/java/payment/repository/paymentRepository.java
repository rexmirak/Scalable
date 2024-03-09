package payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface paymentRepository extends JpaRepository<processedPayments,Long> {
    @Procedure
    void addPayment(@Param("contributionID") Long contributionID,
                    @Param("campaignID") Long campaignID,
                    @Param("userID") Long userID,
                    @Param("amount") Float amount);
}
