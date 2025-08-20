package org.iclass.myboard.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@RequiredArgsConstructor
public class CommunityDto {
    private final Integer idx;
    private final String writer;
    private final String title;
    private final String content;
}
