package fcm;

import java.io.IOException;
import java.util.List;
import org.springframework.core.io.ClassPathResource;
import com.google.auth.oauth2.GoogleCredentials;

public class FirebaseCloudMessageService {
    private String getAccessToken() throws IOException {
        String firebaseConfigPath = "firebase/firebase_service_key.json";
        
        GoogleCredentials googleCredentials = GoogleCredentials
                .fromStream(new ClassPathResource(firebaseConfigPath).getInputStream())
                .createScoped(List.of("https://www.googleapis.com/auth/cloud-platform"));
        
        googleCredentials.refreshIfExpired();
        return googleCredentials.getAccessToken().getTokenValue();
    }
}