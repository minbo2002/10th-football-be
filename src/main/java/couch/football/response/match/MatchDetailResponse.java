package couch.football.response.match;

import couch.football.domain.match.Match;
import couch.football.response.members.MemberResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class MatchDetailResponse {

    private MatchResponse match;
    private List<MemberResponseDto> matchApplicants;
    private List<ReviewResponseDto> matchReviews;

    @Builder
    public MatchDetailResponse(Match match, List<MemberResponseDto> matchApplicants, List<ReviewResponseDto> matchReviews) {
        this.match = new MatchResponse(match);
        this.matchApplicants = matchApplicants;
        this.matchReviews = matchReviews;
    }
}
