package app.repository;

import app.entity.Subscribers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscribersRepo extends JpaRepository<Subscribers,Integer> {

    @Query(value = "Select subtb.kod_abonent,subtb.name_abonent,subtb.telephone_num_abonent,subtb.adres_abonent,subtb.creation_date,ros.id_operator from subscribers_table subtb LEFT JOIN r_operator_subscribers ros on subtb.kod_abonent = ros.id_subscriber where telephone_num_abonent=:telephone and id_operator=:kod_oprt", nativeQuery = true)
    Subscribers findByTelephone_num_abonentAndTelephone_num_abonent(@Param("telephone") String telephone, @Param("kod_oprt") int kod_oprt);

}
