package dao;

import model.Account;

import java.util.List;

public interface AccountDAO {
    void save(Account account);
    void update(Account account);
    void delete(Account account);
    Account findById(int id);
    Account findByIban(String iban);
    Account findByName(String firstname, String lastname);
    Account findBySsn(String ssn);
    List<Account> findAll();
}
