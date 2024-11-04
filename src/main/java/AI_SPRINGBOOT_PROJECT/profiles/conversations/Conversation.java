package AI_SPRINGBOOT_PROJECT.profiles.conversations;


import java.util.List;

public record Conversation(
        String id,
        String profileId,
        List<ChatMessage> message
) {
}
