package olympus.remember.media.models;

import java.util.Date;

public record MediaRequest(int id, String title, String description, String author, Date publishedDate, MediaTypeEnums type) {
}
