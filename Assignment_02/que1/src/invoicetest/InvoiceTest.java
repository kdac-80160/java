package invoicetest;

import com.sunbeam.employee.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		invoice.acceptData();
		invoice.displayData();
		double bill = invoice.calculateAmt();
		System.out.println("Total Bill : "+bill);
	}

}
