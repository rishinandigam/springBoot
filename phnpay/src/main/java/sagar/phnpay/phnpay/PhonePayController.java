package sagar.phnpay.phnpay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PhonePayController {

    PhonePayOperations op = new PhonePayOperations();


    @GetMapping("get/allAccounts")
    public ArrayList<PhonePay> getAllAccounts()
    {
        return  op.getAllAccounts();
    }

    @PostMapping("add/account")
    public boolean addPhnPayAccount(@RequestBody PhonePay p)
    {
        return op.addPhnPayAccount(p);
    }
    @PostMapping("add/multiplePhnpayAccounts")
    public void addMultiplecontacts(ArrayList<PhonePay> list)
    {
        op.addMultipleContacts(list);
    }
}
