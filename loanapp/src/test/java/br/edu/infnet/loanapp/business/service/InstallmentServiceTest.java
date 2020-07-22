package br.edu.infnet.loanapp.business.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.infnet.loanapp.ServletInitializerApplication;
import br.edu.infnet.loanapp.business.model.Contract;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServletInitializerApplication.class)
public class InstallmentServiceTest {

	@Autowired
	private InstallmentService installmentService;

	@Test
	public void testcalculateBasicInstallmentBasedOnPriceTest1() {
		final Contract contract = new Contract();
		contract.setLoanAmount(20000d);
		contract.setInterestRate(0.04);
		contract.setQttInstallments(60);

		assertEquals(884.04, this.installmentService.calculateBasicInstallmentBasedOnPrice(contract), 0d);

		contract.setLoanAmount(250000d);
		contract.setInterestRate(0.065);
		contract.setQttInstallments(130);

		assertEquals(16254.52, this.installmentService.calculateBasicInstallmentBasedOnPrice(contract), 0d);

		contract.setLoanAmount(20000d);
		contract.setInterestRate(0.04);
		contract.setQttInstallments(180);

		assertEquals(800.69, this.installmentService.calculateBasicInstallmentBasedOnPrice(contract), 0d);

	}

}
