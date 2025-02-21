package sasi.backend.api.ContactApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ContactController {

    ContactOperations op   = new ContactOperations() ;

    @GetMapping("get/all/contacts")
    public ArrayList<Contact> getAllContacts()
    {
        return op.getAllContacts();
    }


    @GetMapping("get/bykey/{key}")
    public ArrayList<Contact> searchByKey(String key)
    {
        return op.searchByKey(key);
    }



    @PostMapping("add/contact")
    public boolean addContact(@RequestBody Contact c)
    {
       return op.addContact(c);
    }



    @PostMapping("add/multiple/contacts")
    @GetMapping("get/addDetails")
   public example addMultipleContacts(@RequestBody ArrayList<Contact> list)
   {
       ArrayList<String> msglist = new ArrayList<>();
       ArrayList<Contact> addlist = new ArrayList<>();
       ArrayList<Contact> notaddlist = new ArrayList<>();

       example e = new example();

       for(Contact temp : list)
       {

           if( op.addContact(temp))
           {
              addlist.add(temp);

           }
           else{
               notaddlist.add(temp);

           }

       }
     e.addedList= addlist;
       e.notAdedList  =notaddlist;
       return e;
   }

}
