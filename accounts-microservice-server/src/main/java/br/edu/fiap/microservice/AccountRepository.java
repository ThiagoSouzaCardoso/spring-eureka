package br.edu.fiap.microservice;

import java.util.List;

public interface AccountRepository {

	public List<Account> getAllAccounts();

	public Account getAccount(String id);

}
