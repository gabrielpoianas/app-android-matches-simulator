package gabrielpoianas.dev.br.simulator.data;

import java.util.List;

import gabrielpoianas.dev.br.simulator.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
