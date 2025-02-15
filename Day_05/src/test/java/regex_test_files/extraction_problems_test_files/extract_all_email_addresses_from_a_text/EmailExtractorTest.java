package regex_test_files.extraction_problems_test_files.extract_all_email_addresses_from_a_text;

import static org.junit.jupiter.api.Assertions.*;

import regex.extraction_problems.extract_all_email_addresses_from_a_text.EmailExtractor;
import org.junit.jupiter.api.Test;

import java.util.List;

class EmailExtractorTest {

    @Test
    void testValidEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> emails = EmailExtractor.extractEmails(text);
        assertEquals(2, emails.size());
        assertTrue(emails.contains("support@example.com"));
        assertTrue(emails.contains("info@company.org"));
    }

    @Test
    void testNoEmails() {
        String text = "This is just some random text without emails.";
        List<String> emails = EmailExtractor.extractEmails(text);
        assertTrue(emails.isEmpty());
    }

    @Test
    void testEmailsWithSpecialCharacters() {
        String text = "Emails: john.doe+test@gmail.com, user_name123@my-domain.net";
        List<String> emails = EmailExtractor.extractEmails(text);
        assertEquals(2, emails.size());
        assertTrue(emails.contains("john.doe+test@gmail.com"));
        assertTrue(emails.contains("user_name123@my-domain.net"));
    }

    @Test
    void testInvalidEmails() {
        String text = "Invalid emails: @example.com, user@.com, test@domain, abc@domain@com";
        List<String> emails = EmailExtractor.extractEmails(text);
        assertTrue(emails.isEmpty());
    }
}
