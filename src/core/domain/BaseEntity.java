package core.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class BaseEntity {
    private UUID id = UUID.randomUUID();
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    public UUID getId(){
        return id;
    }
}
