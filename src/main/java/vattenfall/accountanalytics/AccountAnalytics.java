package vattenfall.accountanalytics;

import vattenfall.accountanalytics.exception.EntityNotFoundException;
import vattenfall.accountanalytics.model.Account;

import java.math.BigDecimal;
import java.time.Month;
import java.util.*;

/**
 * Implement methods using Stream API
 */
class AccountAnalytics {
    private Collection<Account> accounts;

    static AccountAnalytics of(Collection<Account> accounts) {
        return new AccountAnalytics(accounts);
    }

    private AccountAnalytics(Collection<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     * Returns {@link Optional} that contains an {@link Account} with the max value of balance
     *
     * @return account with max balance wrapped with optional
     */
    Optional<Account> findRichestPerson() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a {@link List} of {@link Account} that have a birthday month equal to provided.
     *
     * @param birthdayMonth a month of birth
     * @return a list of accounts
     */
    List<Account> findAccountsByBirthdayMonth(Month birthdayMonth) {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a map that separates all accounts into two lists - male and female. Map has two keys {@code true} indicates
     * male list, and {@code false} indicates female list.
     *
     * @return a map where key is true or false, and value is list of male, and female accounts
     */
    Map<Boolean, List<Account>> partitionMaleAccounts() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a {@link Map} that stores accounts grouped by its email domain. A map key is {@link String} which is an
     * email domain like "gmail.com". And the value is a {@link List} of {@link Account} objects with a specific email domain.
     *
     * @return a map where key is an email domain and value is a list of all account with such email
     */
    Map<String, List<Account>> groupAccountsByEmailDomain() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a number of letters in all first and last names.
     *
     * @return total number of letters of first and last names of all accounts
     */
    int getNumOfLettersInFirstAndLastNames() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a total balance of all accounts.
     *
     * @return total balance of all accounts
     */
    BigDecimal calculateTotalBalance() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a {@link List} of {@link Account} objects sorted by first and last names.
     *
     * @return list of accounts sorted by first and last names
     */
    List<Account> sortByFirstAndLastNames() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Checks if there is at least one account with provided email domain.
     *
     * @param emailDomain
     * @return true if there is an account that has an email with provided domain
     */
    boolean containsAccountWithEmailDomain(String emailDomain) {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns account balance by its email. Throws {@link EntityNotFoundException} with message
     * "Cannot find Account by email={email}" if account is not found.
     *
     * @param email account email
     * @return account balance
     */
    BigDecimal getBalanceByEmail(String email) {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Collects all existing accounts into a {@link Map} where a key is account id, and the value is {@link Account} instance
     *
     * @return map of accounts by its ids
     */
    Map<Long, Account> collectAccountsById() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Filters accounts by the year when an account was created. Collects account balances by its emails into a {@link Map}.
     * The key is Account#email and the value is Account#balance
     *
     * @param year the year of account creation
     * @return map of account by its ids the were created in a particular year
     */
    Map<String, BigDecimal> collectBalancesByIdForAccountsCreatedOn(int year) {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a {@link Map} where key is Account#lastName and values is a {@link Set} that contains first names
     * of all accounts with a specific last name.
     *
     * @return a map where key is a first name and value is a set of first names
     */
    Map<String, Set<String>> groupFirstNamesByLastNames() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a {@link Map} where key is a birthday month, and value is a {@link String} that stores comma and space
     * -separated first names (e.g. "Polly, Dylan, Clark"), of all accounts that have the same birthday month.
     *
     * @return a map where a key is a birthday month and value is comma-separated first names
     */
    Map<Month, String> groupCommaSeparatedFirstNamesByBirthdayMonth() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a {@link Map} where key is a {@link Month} of Account#creationDate, and value is total balance
     * of all accounts that have the same value creation month.
     *
     * @return a map where key is a creation month and value is total balance of all accounts created in that month
     */
    Map<Month, BigDecimal> groupTotalBalanceByCreationMonth() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a {@link Map} where key is a letter {@link Character}, and value is a number of its occurrences in
     * Account#firstName.
     *
     * @return a map where key is a letter and value is its count in all first names
     */
    Map<Character, Long> getCharacterFrequencyInFirstNames() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

    /**
     * Returns a {@link Map} where key is a letter {@link Character}, and value is a number of its occurrences ignoring
     * case, in all Account#firstName and Account#lastName. All letters should stored in lower case.
     *
     * @return a map where key is a letter and value is its count ignoring case in all first and last names
     */
    Map<Character, Long> getCharacterFrequencyIgnoreCaseInFirstAndLastNames() {
        throw new UnsupportedOperationException("It's your job to implement this method"); // todo
    }

}

