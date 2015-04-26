package ua.org.oa.angelikskors;
//not good name for interface. In that case name of interface should be answer on question WHO? - Protector
public interface CanProtect {

	void attack();

	void protect(boolean owners, boolean thief, boolean somethingElse);
}
