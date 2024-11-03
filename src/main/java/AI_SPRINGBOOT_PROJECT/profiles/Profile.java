package AI_SPRINGBOOT_PROJECT.profiles;

public record Profile(
        String id,
        String firstName,
        String lastName,
        String age,
        Gender gender,
        String bio,
        String ethinicity,
        String imageUrl,
        String myersBriggsPersonalityType
) {

}
