package edu.unaigomdie.dan2024.features.movies.data.remote

import edu.unaigomdie.dan2024.features.movies.domain.Movie

/**
 * naming: Modelo + Tecnologia + RemoteDataSource
 * */
class MovieMockRemoteDataSource {

    fun getMovies(): List<Movie> {
        return listOf(
            Movie("1", "title1", "poster1"),
            Movie("2", "title2", "poster2"),
            Movie("3", "title3", "poster3"),
            Movie(title = "title4", poster = "poster4", id = "4")
        )
    }

    fun getMovie(id: String): Movie? {
        return getMovies().firstOrNull {
            it.id == id
        }
    }

}