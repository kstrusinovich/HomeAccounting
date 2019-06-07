package service;

import model.Accrual;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.AccrualRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountingService {

    private final AccrualRepository accrualRepository;

    public AccountServiceImpl(AccrualRepository accrualRepository) {
        this.accrualRepository = accrualRepository;
    }

    @Transactional
    @Override
    public List<Accrual> findAccrualAll() {
        return toList(accrualRepository.findAll());
    }


    private <T> List<T> toList(Iterable<T> items){
        List<T> list = new ArrayList<>();
        for (T t : items){
            list.add(t);
        }
        return list;
    }
}
