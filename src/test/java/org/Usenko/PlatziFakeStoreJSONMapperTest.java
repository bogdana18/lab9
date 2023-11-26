package org.Usenko;
import org.Usenko.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PlatziFakeStoreJSONMapperTest {

    PlatziFakeStoreJSONMapper mapper;
    @BeforeEach
    void setUp() {
        mapper = new PlatziFakeStoreJSONMapper();
    }

    @Test
    void MapCategories_MinimalValidJSON_ShouldReturnListOfCategories() {
        Category expected = new Category(1, "Test category", "TestImage.jpeg");
        String json = """
                [
                  {
                    "id": 1,
                    "name": "Test category",
                    "image": "TestImage.jpeg"
                  }
                ]
                """;

        var actual = mapper.mapCategories(json);

        assertFalse(actual.isEmpty());
        assertEquals(1, actual.size());
        assertEquals(expected.toString(), actual.get(0).toString());
    }

    @Test
    void MapUsers_MinimalValidJSON_ShouldReturnListOfUsers() {
        User expected = new User(1, "test@test.com", "111111", "test", "tester", "test.jpg");
        String json = """
                [
                  {
                    "id": 1,
                    "email": "test@test.com",
                    "password": "111111",
                    "name": "test",
                    "role": "tester",
                    "avatar": "test.jpg"
                  }
                ]
                """;

        var actual = mapper.mapUsers(json);

        assertFalse(actual.isEmpty());
        assertEquals(1, actual.size());
        assertEquals(expected.toString(), actual.get(0).toString());
    }
}
