package regex_test_files.extraction_problems_test_files.extract_links_from_a_web_page;

import static org.junit.jupiter.api.Assertions.*;

import regex.extraction_problems.extract_links_from_a_web_page.LinkExtractor;
import org.junit.jupiter.api.Test;

import java.util.List;

class LinkExtractorTest {

    @Test
    void testValidLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        List<String> links = LinkExtractor.extractLinks(text);
        assertEquals(List.of("https://www.google.com", "http://example.org"), links);
    }

    @Test
    void testLinksWithPaths() {
        String text = "Check out https://www.example.com/path/to/page and http://test.net/docs.";
        List<String> links = LinkExtractor.extractLinks(text);
        assertEquals(List.of("https://www.example.com/path/to/page", "http://test.net/docs"), links);
    }

    @Test
    void testNoLinks() {
        String text = "No links here, just text.";
        List<String> links = LinkExtractor.extractLinks(text);
        assertTrue(links.isEmpty());
    }

    @Test
    void testMalformedLinks() {
        String text = "Invalid URLs: htt://invalid.com, www.missinghttp.com";
        List<String> links = LinkExtractor.extractLinks(text);
        assertTrue(links.isEmpty());
    }
}
