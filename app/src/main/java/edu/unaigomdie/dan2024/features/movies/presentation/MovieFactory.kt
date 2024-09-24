package edu.unaigomdie.dan2024.features.movies.presentation

import edu.unaigomdie.dan2024.features.movies.data.MovieDataRepository
import edu.unaigomdie.dan2024.features.movies.data.remote.MovieMockRemoteDataSource
import edu.unaigomdie.dan2024.features.movies.domain.GetMovieUseCase
import edu.unaigomdie.dan2024.features.movies.domain.GetMoviesUseCase

class MovieFactory {

    private val movieDataRepository = MovieDataRepository(MovieMockRemoteDataSource())

    fun buildViewModel(): MovieViewModel {
        return MovieViewModel(
            GetMoviesUseCase(movieDataRepository),
            GetMovieUseCase(movieDataRepository)
        )

    }

}