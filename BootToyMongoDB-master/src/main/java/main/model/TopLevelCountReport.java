package main.model;



public class TopLevelCountReport {
	
	
	private String accountId;

	private long total;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Account ID :- " + getAccountId()).append(", Total :- " + getTotal());
		return s.toString();
	}

	
}
