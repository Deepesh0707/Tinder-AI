package AI_SPRINGBOOT_PROJECT.profiles;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface profileRepository extends MongoRepository<Profile,String> {
}
