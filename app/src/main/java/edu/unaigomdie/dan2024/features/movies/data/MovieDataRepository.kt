package edu.unaigomdie.dan2024.features.movies.data

import edu.unaigomdie.dan2024.features.movies.data.remote.MovieMockRemoteDataSource
import edu.unaigomdie.dan2024.features.movies.domain.Movie
import edu.unaigomdie.dan2024.features.movies.domain.MovieRepository

class MovieDataRepository(private val mockRemoteDataSource: MovieMockRemoteDataSource) :
    MovieRepository {

    override fun getMovies(): List<Movie> {
        return mockRemoteDataSource.getMovies()
    }

    override fun getMovie(id: String): Movie? {
        return mockRemoteDataSource.getMovie(id)
    }

}