package sasi.backend.api.ContactApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ContactOperations
{

    ArrayList<Contact> contacts = new ArrayList();





    public boolean addContact(Contact c)

    {
        for (Contact temp : contacts)

        {

            if (temp.getMobileNumber() == c.getMobileNumber())

            {

                System.out.println("Duplicate Number is given");

                return false;

            }
        }

        contacts.add(c);

        return true;
    }



    public ArrayList<Contact> searchByType(String type)

    {

        ArrayList<Contact> list = new ArrayList();

        for(Contact temp : contacts)

        {

            if(temp.getType().equals(type))

            {

                list.add(temp);

            }

        }

        return list;

    }


    public ArrayList<Contact> searchByKey(String key)

    {

        ArrayList<Contact> list = new ArrayList();

        for (Contact c : contacts)

        {

            if(c.getName().contains(key))

            {

                list.add(c);

            }

        }

        return list;

    }
    public ArrayList<Contact> getAllContacts()
    {
        return contacts;
    }

}
