package org.iclass.myboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.myboard.dto.CommunityDto;

@Mapper
public interface CommunityMapper {
    List<CommunityDto> selectAll();
    int post();
    int delete();
    int edit();
}
