const backendApi = process.env.SGR_BACKEND_API;

export default async function fetchFromBackendApi<T>(url: string, options: RequestInit): Promise<T> {
    return fetch(`${backendApi}${url}`, options)
        .then(resp => resp.json())
        .then(resp => returnResponseOrThrowErrorIfAny(resp));
}

function returnResponseOrThrowErrorIfAny(response: any) {
    if (response?.error || response?.message || response?.ok === false) {
        throw new Error(
            `ErrorCode: ${response.status || "NaN"}; details: ${JSON.stringify(response)}`
        );
    }
    return response;
}