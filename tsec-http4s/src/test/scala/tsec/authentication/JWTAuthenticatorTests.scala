package tsec.authentication

import cats.effect.IO
import tsec.cipher.symmetric.imports._
import tsec.jws.mac.JWTMac
import tsec.mac.imports._

class JWTAuthenticatorTests extends JWTAuthenticatorSpec {

  AuthenticatorTest[AugmentedJWT[HMACSHA256, Int]]("HMACSHA256 JWT Stateful Authenticator", genStatefulAuthenticator[HMACSHA256])
  AuthenticatorTest[AugmentedJWT[HMACSHA384, Int]]("HMACSHA384 JWT Stateful Authenticator", genStatefulAuthenticator[HMACSHA384])
  AuthenticatorTest[AugmentedJWT[HMACSHA512, Int]]("HMACSHA512 JWT Stateful Authenticator", genStatefulAuthenticator[HMACSHA512])
  AuthenticatorTest[AugmentedJWT[HMACSHA256, Int]]("HMACSHA256 JWT Stateless Authenticator", genStateless[HMACSHA256, AES128])
  AuthenticatorTest[AugmentedJWT[HMACSHA384, Int]]("HMACSHA384 JWT Stateless Authenticator", genStateless[HMACSHA384, AES128])
  AuthenticatorTest[AugmentedJWT[HMACSHA512, Int]]("HMACSHA512 JWT Stateless Authenticator", genStateless[HMACSHA512, AES128])

  requestAuthTests[AugmentedJWT[HMACSHA256, Int]]("HMACSHA256 JWT Stateful Authenticator", genStatefulAuthenticator[HMACSHA256])
  requestAuthTests[AugmentedJWT[HMACSHA384, Int]]("HMACSHA384 JWT Stateful Authenticator", genStatefulAuthenticator[HMACSHA384])
  requestAuthTests[AugmentedJWT[HMACSHA512, Int]]("HMACSHA512 JWT Stateful Authenticator", genStatefulAuthenticator[HMACSHA512])
  requestAuthTests[AugmentedJWT[HMACSHA256, Int]]("HMACSHA256 JWT Stateless Authenticator", genStateless[HMACSHA256, AES128])
  requestAuthTests[AugmentedJWT[HMACSHA384, Int]]("HMACSHA384 JWT Stateless Authenticator", genStateless[HMACSHA384, AES128])
  requestAuthTests[AugmentedJWT[HMACSHA512, Int]]("HMACSHA512 JWT Stateless Authenticator", genStateless[HMACSHA512, AES128])
}
