package AI_SPRINGBOOT_PROJECT;

import AI_SPRINGBOOT_PROJECT.profiles.Gender;
import AI_SPRINGBOOT_PROJECT.profiles.Profile;
import AI_SPRINGBOOT_PROJECT.profiles.conversations.ChatMessage;
import AI_SPRINGBOOT_PROJECT.profiles.conversations.Conversation;
import AI_SPRINGBOOT_PROJECT.profiles.conversations.conversationsRepository;
import AI_SPRINGBOOT_PROJECT.profiles.profileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class AI_SPRINGBOOT_PROJECT implements CommandLineRunner {
	@Autowired
	private profileRepository profileRepository;

	@Autowired
	private conversationsRepository conversationRepository;

	public static void main(String[] args) {
		SpringApplication.run(AI_SPRINGBOOT_PROJECT.class, args);
	}

	public void run(String... args){
		System.out.println("hlo world");
		Profile profile=new Profile(
				"1",
				"Deepesh",
				"Goyal",
				"24",
				Gender.Male,
				"Hlo new to tinder",
				"Asian",
				"https://www.shutterstock.com/image-photo/dog-nova-scotia-duck-tolling-retriever-360391505",
				"hlo hi"

		);
		profileRepository.save(profile);
		profileRepository.findAll().forEach(System.out::println);

		Conversation conversation=new Conversation("1",profile.id(), List.of(new ChatMessage("hlo world",profile.id(), LocalDateTime.now())));
		conversationRepository.save(conversation);
		conversationRepository.findAll().forEach(System.out::println);
	}

}
