package sagar.phnpay.phnpay;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
@Service
public class PhonePayOperations
{

    ArrayList<PhonePay> phnpayAccounts = new ArrayList<>();
    public boolean addPhnPayAccount(PhonePay p)
    {

            for (PhonePay temp : phnpayAccounts)
            {
                if (temp.getMobileNumber() == p.getMobileNumber())
                {
                    System.out.println("Account Already Exists");

                    return false;


                }

            }
        phnpayAccounts.add(p);
            return true;



    }

    public ArrayList<PhonePay> searchByKey(String key)
    {
        ArrayList<PhonePay> list = new ArrayList<>();
        for(PhonePay temp : phnpayAccounts)
        {
            if(temp.getName().contains(key))
            {
                list.add(temp);
            }

        }
        return list;
    }


    public PhonePay searchUpi(String upi)
    {
        for (PhonePay temp : phnpayAccounts)
        {
            if(temp.getName().equals(upi))
            {
                return temp;
            }

        }

        return null;
    }


    public ArrayList<PhonePay> getAllAccounts()
    {
        return phnpayAccounts;
    }

    public PrintMSg addMultipleContacts(ArrayList<PhonePay> acclist)
    {
       PrintMSg m  = new PrintMSg();

        for(PhonePay temp : acclist)
        {
            if(addPhnPayAccount(temp))
            {
               m.addedList.add(temp);
            }
            else{
                m.notaddedList.add(temp);
            }
        }

        return m;
    }

}
