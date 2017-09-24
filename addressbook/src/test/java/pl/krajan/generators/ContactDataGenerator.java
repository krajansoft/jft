package pl.krajan.generators;

import pl.krajan.model.ContactData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ContactDataGenerator {
    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(args[0]);
        File file = new File(args[1]);

     List<ContactData> contacts = generateContacts(count);
     save(contacts, file);

    }

    private static void save(List<ContactData> contacts, File file) throws IOException {
        System.out.println(new File(".").getAbsolutePath());//weryfikacja sciezki
        Writer writer = new FileWriter(file);
        for (ContactData contact : contacts){
            writer.write(String.format("%s;%s;%s;%s;%s;%s;%s;%s;\n", contact.getFirstname(), contact.getLastname(), contact.getNickname(), contact.getCompany(), contact.getMobile(), contact.getEmail(), contact.getAddress2(), contact.getGroup()));
        }
        writer.close();
    }

    private static List<ContactData> generateContacts(int count) {
        List<ContactData> contacts = new ArrayList<ContactData>();
        for (int i = 0; i < count; i++){
            contacts.add(new ContactData().withFirstname(String.format("Name %s", i)).withLastname(String.format("LastName %s", i)).withNickname(String.format("Nick %s", i)).withCompany(String.format("krajansoft%s", i)).withMobile(String.format("77799900%s", i)).withEmail(String.format("krajansoft" + "%s" +"@gmail.com", i)).withAddress2(String.format("Adress %s", i)).withGroup(String.format("AdamQA1", i)));
        }
        return contacts;
    }
}
