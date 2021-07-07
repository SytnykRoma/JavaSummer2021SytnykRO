package homeworks.lesson_5.controller;

/**
 * Created by student on 07.07.2021.
 */
public interface RegexContainer {
    // Nickname (login)
    String REGEX_NICKNAME = "^[a-zA-Z][a-zA-Z0-9-_\\.]{8,32}$";

    // Latin last name
    String REGEX_LASTNAME_LAT = "^([A-Z]{1}[a-z]{1,})$";
    // Latin name
    String REGEX_NAME_LAT = "^([A-Z]{1}[a-z]{1,})$";

    // Cyrillic last name
    String REGEX_LASTNAME_UKR = "^([А-ЩЬЮЯҐІЇЄ]{1}[а-щьюяґіїє']{1,})$";
    // Cyrillic name
    String REGEX_NAME_UKR = "^([А-ЩЬЮЯҐІЇЄ]{1}[а-щьюяґіїє']{1,})$";
    // Cyrillic patronymic
    String REGEX_PATRONYMIC_UKR = "^([А-ЩЬЮЯҐІЇЄ]{1}[а-щьюяґіїє']{1,})$";
}