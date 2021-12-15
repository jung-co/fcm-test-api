package fcm;

import com.google.auto.value.AutoValue.Builder;
import com.google.firebase.messaging.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class FcmMessage {
    private boolean validate_only;
    private Message message;
}
