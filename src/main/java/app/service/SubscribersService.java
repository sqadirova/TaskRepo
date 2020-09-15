package app.service;

import app.entity.Subscribers;
import app.repository.SubscribersRepo;
import org.springframework.stereotype.Service;

@Service
public class SubscribersService {
    private final SubscribersRepo subscribersRepo;

    public SubscribersService(SubscribersRepo subscribersRepo) {
        this.subscribersRepo = subscribersRepo;
    }

    public Subscribers get_subscriber_by(String telephon,int kod_operator){
        return subscribersRepo.findByTelephone_num_abonentAndTelephone_num_abonent(telephon,kod_operator);
    }

    public void saveSubscriber(Subscribers s){
         subscribersRepo.save(s);
    }
}
